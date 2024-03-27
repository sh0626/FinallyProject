package com.health.controller;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.domain.Exercise;
import com.health.domain.Journal;
import com.health.domain.Member;
import com.health.service.JournalService;

@Controller
public class JournalController {

    @Autowired
    private JournalService service;
    
    // 운동일지 상세 작성
    @PostMapping("/eWriteProcess")
    public String insertExercise(HttpServletRequest request, HttpSession session,
            @RequestParam(value = "exerciseCate", required = false) String[] exerciseCates,
            @RequestParam(value = "exerciseName", required = false) String[] exerciseNames,
            @RequestParam(value = "journalNo", required = false) int journalNo,
            @RequestParam(value = "exerciseWeight", required = false) int[] exerciseWeights,
            @RequestParam(value = "exerciseSet", required = false) int[] exerciseSets,
            @RequestParam(value = "exerciseRep", required = false) int[] exerciseReps) {

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        }
        // 운동 정보를 운동일지에 추가
        for (int i = 0; i < exerciseCates.length; i++) {
            Exercise exercise = new Exercise();
            exercise.setExerciseCate(exerciseCates[i]);
            exercise.setExerciseName(exerciseNames[i]);
            exercise.setExerciseWeight(exerciseWeights[i]);
            exercise.setExerciseSet(exerciseSets[i]);
            exercise.setExerciseRep(exerciseReps[i]);
            exercise.setFK_exercise_journal(journalNo);
            service.insertExercise(exercise);
        }
        return "redirect:/journalDetail?journalNo=" + journalNo; // 운동일지 상세 페이지로 리다이렉트
    }

    // 운동일지 게시판 작성
    @PostMapping("/jWriteProcess")
    public String insertJournal(String journalTitle, HttpServletRequest request, HttpSession session,
            @RequestParam(value = "no", required = false) Integer no) {

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        }
        no = member.getUserNo();
        // 운동일지 생성 및 추가
        Journal journal = new Journal();
        journal.setJournalTitle(journalTitle);
        journal.setFK_journal_user(no);
        service.insertJournal(journal);
        return "redirect:trainingJournal"; // 운동일지 목록 페이지로 리다이렉트
    }

    // 운동일지 리스트 출력
    @RequestMapping(value = "/trainingJournal", method = RequestMethod.GET)
    public String getJournal(Model model, HttpServletRequest request, HttpSession session,
            @RequestParam(value = "no", required = false) Integer no) {

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        }
        no = member.getUserNo();
        // 사용자의 운동일지 목록 가져오기
        Map<String, Object> modelMap = service.journalList(no);
        model.addAllAttributes(modelMap);
        return "trainingJournal"; // 운동일지 목록 페이지 출력
    }

    // 운동일지 상세 출력
    @GetMapping("/journalDetail")
    public String getExercise(Model model, int journalNo, HttpServletRequest request, HttpSession session) {

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        }
        // 선택된 운동일지의 운동 목록 가져오기
        Map<String, Object> modelMap = service.exerciseList(journalNo);
        model.addAllAttributes(modelMap);
        model.addAttribute("journalNo", journalNo);
        return "journalDetail"; // 운동일지 상세 페이지 출력
    }

    // 운동일지 상세 일지 정보 출력
    @GetMapping("/exerciseWrite")
    public String getDetail(Model model, int journalNo, HttpServletRequest request, HttpSession session) {

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        }
        // 선택된 운동일지의 상세 정보 가져오기
        Journal journal = service.getJounal(journalNo);
        model.addAttribute(journal);
        return "exerciseWrite"; // 운동일지 상세 페이지 출력
    }

    // 운동일지 삭제
    @RequestMapping("/deleteJ")
    public String deleteJournal(int journalNo) {
        // 운동일지 삭제
        service.deleteJournal(journalNo);
        return "redirect:trainingJournal"; // 운동일지 목록 페이지로 리다이렉트
    }

    // 운동일지 상세 삭제
    @RequestMapping("/delete")
    public String deleteExercises(@RequestParam("selectedItems") int[] selectedItems, int journalNo,
            HttpServletRequest request, HttpSession session) {

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        }
        // 선택된 운동일지의 운동 삭제
        for (int exerciseNo : selectedItems) {
            service.deleteExercise(exerciseNo);
        }
        return "redirect:journalDetail?journalNo=" + journalNo; // 운동일지 상세 페이지로 리다이렉트
    }
}


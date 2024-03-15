package com.health.domain;

import java.sql.Timestamp;

public class exercise {

	private String exerciseCate;
	private String exerciseName;
	private int exerciseWeight;
	private int exerciseSet;
	private int exerciseRep;
	private int FK_exercise_journal;

	public exercise() {}

	public exercise(String exerciseCate, String exerciseName, int exerciseWeight, int exerciseSet, int exerciseRep,
			int FK_exercise_journal) {
		this.exerciseCate = exerciseCate;
		this.exerciseName = exerciseName;
		this.exerciseWeight = exerciseWeight;
		this.exerciseSet = exerciseSet;
		this.exerciseRep = exerciseRep;
		this.FK_exercise_journal = FK_exercise_journal;
	}

	public String getExerciseCate() {
		return exerciseCate;
	}

	public void setExerciseCate(String exerciseCate) {
		this.exerciseCate = exerciseCate;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public int getExerciseWeight() {
		return exerciseWeight;
	}

	public void setExerciseWeight(int exerciseWeight) {
		this.exerciseWeight = exerciseWeight;
	}

	public int getExerciseSet() {
		return exerciseSet;
	}

	public void setExerciseSet(int exerciseSet) {
		this.exerciseSet = exerciseSet;
	}

	public int getExerciseRep() {
		return exerciseRep;
	}

	public void setExerciseRep(int exerciseRep) {
		this.exerciseRep = exerciseRep;
	}

	public int getFK_exercise_journal() {
		return FK_exercise_journal;
	}

	public void setFK_exercise_journal(int FK_exercise_journal) {
		this.FK_exercise_journal = FK_exercise_journal;
	}

	

}
<%@page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@page import="org.springframework.security.core.Authentication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.health.domain.ScheduleDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%
	List<ScheduleDTO> list = (ArrayList<ScheduleDTO>) request.getAttribute("showSchedule");
%>
<script>
  document.addEventListener('DOMContentLoaded', function() {
	 
    var calendarEl = document.getElementById('calendar');
	
    var calendar = new FullCalendar.Calendar(calendarEl, {
      plugins: [ 'interaction', 'dayGrid', 'timeGrid', 'list' ],
      header: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay,listMonth'
      },
      locale : "ko",
      //defaultDate: "2019-08-22", 이거 삭제하면 현재 날짜로됨
      navLinks: true, // can click day/week names to navigate views
      businessHours: true, // display business hours
      editable: true,
      events: [
<%for (int i = 0; i < list.size(); i++) {
	ScheduleDTO dto = (ScheduleDTO) list.get(i);%>	
  	  {
  	   title : '<%=dto.getSubject()%>',
  	   start : '<%=dto.getStartDate()%>',
  	   end : '<%=dto.getEndDate()%>',
  	   memo : '<%=dto.getMemo()%>'
  	   },
<%}%>
		{
		   title : 'defult',
		   start : "2019-01-01",
		   end : "2019-01-01"
		  }
      ]
    });

    calendar.render();
});
</script>

<!-- container section start -->
<section class="contact-section spad">
	<div id="container">
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<div class="row">
					<div class="col-lg-12">
						<h3 class="page-header">
							일정 관리
						</h3>
					</div>
					<!-- Form validations -->
					<div class="row">
						<div class="col-lg-12">
							<section class="panel">
								<header class="panel-heading"> 다이어리 </header>
								<div class="panel-body">
									<!-- schedule start -->
									<div id='calendar' style="position: relative;">
										<div>
											<button class="add-button" type="button"
												onclick="click_add();">일정 추가</button>
										</div>
									</div>

								</div>
							</section>
						</div>
					</div>
					
					<!-- page end-->
				</div>
			</section>
		</section>
	</div>
</section>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/sidebar.css">
</head>
<body>
 	<div id="sidebar">
        <div class="sideitem">
            <h3>홍길동님</h3>
        </div>
        <div class="sideitem" style="text-align:left;">
            <h3 style="margin-bottom:16px;">내 포인트 ></h3>
            <h3 style="color:#4948e8;">45,000P</h3>
        </div>
        <div class="sideitem">
            <h3 style="color:#4948e8;">마이 파인</h3>
            <ul>
	            <li><a href="mypage_campaign_advertiser.jsp"><img class="icons" src="https://img.icons8.com/?size=100&id=6YVjhQYEKHAS&format=png&color=000000">캠페인 관리</a></li>
	            <li><a href="mypage_advertiser_info.jsp"><img class="icons" src="https://img.icons8.com/?size=100&id=zxB19VPoVLjK&format=png&color=000000">프로필 관리</a></li>
	            <li><a href="mypage_advertiser_requestedInfluencer.jsp"><img class="icons" src="https://img.icons8.com/?size=100&id=YzsadpdsoN8e&format=png&color=000000">요청한 인플루언서 관리</a></li>
	            <li><a href="mypage_point_record.jsp"><img class="icons" src="https://img.icons8.com/?size=100&id=xDnuaxgjAmJP&format=png&color=000000">포인트 관리</a></li>
	            <li><a href="mypage_bookmark_advertiser.jsp"><img class="icons" src="https://img.icons8.com/?size=100&id=RvKp6z6EcIsB&format=png&color=000000">북마크 관리</a></li>
            </ul>
        </div>
    </div>
</body>
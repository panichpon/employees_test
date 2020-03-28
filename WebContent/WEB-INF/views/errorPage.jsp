<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<meta name="description" content="ระบบบริหารจัดการฟาร์มโคเนื้อ">
  	<meta name="keywords" content="เซียน, เซียนวัว, ระบบจัดการวัว, ฟาร์มโคเนื้อ, เซียนบีฟ, ระบบจัดการฟาร์มวัวเนื้อ, วัวเนื้อ, โคเนื้อ, ระบบเซียน, โคสาว, โคคลอด, แม่โครอคลอด, แม่โครอผสม, โคสัด, โคแท้ง, Zyan Beef, ZyanWoa.com">
  	<meta name="author" content="Zyntelligent Co., Ltd.">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1" />
	<title>Zyan Beef - Error Page</title>
	
</head>

<body>

<div id="page-transitions">

	<div id="header" class="header-logo-left header-dark">
		<a href="#" class="header-logo font-21"></a>
		<a href="#" class="header-icon header-icon-1 hamburger-animated font-21" data-deploy-menu="menu-8"></a>	
	</div>
 	
 	<div id="menu-8" class="menu-wrapper menu-light menu-modal-full menu-thumbnails">
            <div class="menu-scroll">
                <a href="${pageContext.request.contextPath}/member/home" class="menu-logo">
                    <em class="menu-logo-image"></em>
                    <em class="menu-logo-text font-18 bold">เมนูหลัก</em>
                </a>
                <div class="menu">
                    <a href="${pageContext.request.contextPath}/news"><i class="fa fa-star color-yellow-dark"></i><em class="font-16 bold">ข่าวสาร</em></a>
                    <a href="${pageContext.request.contextPath}/member/home" class="active-item"><i class="fa fa-home color-blue-dark"></i><em class="font-20 bold">หน้าหลัก</em></a>
                    <a href="#" class="close-menu"><i class="fa fa-times color-black"></i><em class="font-16 bold">ปิด</em></a>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
		
	<div id="page-content" class="page-content">	
		<div id="page-content-scroll"><!--Enables this element to be scrolled --> 	

			<div id="page-404">
				<h1 class="center-text">${code}</h1>
				<h4 class="center-text uppercase ultrabold full-bottom">${errorMsg}</h4>
				<p class="center-text">
					เกิดข้อผิดพลาดบางประการ
				</p>
				<a href="${pageContext.request.contextPath}/" class="button button-green button-s button-center button-rounded uppercase button-s ultrabold font-16">กลับไปยังหน้าหลัก</a>
			</div>
			
		
			
		</div>  
	</div>
	
	<a href="#" class="back-to-top-badge back-to-top-small"><i class="fa fa-angle-up"></i>Back to Top</a>
</div>
	



</body>
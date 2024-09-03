# KOSTA FINAL PROJECT<br/>(`HRD&GROUPWARE SYSTEM` 웹 풀스택 개발)
*※ 기존에 수행한 https://github.com/choiwanmin/kosta_final_pjt 프로젝트를 정비 및 정리*

## 목차
 * [프로젝트 소개](#프로젝트-소개)
 * [기술 스택](#기술-스택)
 * [주요 기능](#주요-기능)
 * [주요 작업 내용](#주요-작업-내용)
 * [프로젝트 아키텍쳐](#프로젝트-아키텍쳐)
 * [클라이언트 화면 UI](#클라이언트-화면-UI)
 * [기타](#기타)

## 프로젝트 소개
> ### 프로젝트 개요
 * `java`기반의 `Spring Boot` 프레임워크를 활용한 웹 풀스택 개발
 * 개발 기간 : 2024.05.24 ~ 2024.06.26 (34일)
 * 개발 구성원 : 5명 (`FullStack` - 각 담당 영역의 BE/FE 작업을 진행)
> ### 프로젝트 목표
 * 팀 및 서비스 목표
   * 사내 사용자가 각기 별개의 작업 환경에서 통합된 하나의 프로젝트를 동시에 수행할 수 있도록 도움을 주는 소프트웨어를 제작
   * 관리자와 사원의 영역을 나누어 업무를 정형화함으로써 업무 생산성 향상을 목적에 둠
 * 개인 목

## 기술 스택
|구분|사용 기술|
|:---|:---|
|Front-end|`HTML`, `CSS`, `Javascript`, `Thymeleaf`, `Ajax`, `JQuery`|
|Back-end|`Java`, `Maven`, `Spring Boot`, `Spring Data JPA`, `JDBC API`, `Oracle Driver`, `Lombok`, `Spring Security`, `WebSocket` 등|
|DBMS|`Oracle`|
|SEVER|`Apache Tomcat`|
|IDE|`Eclipse`, `IntelliJ`, `Oracle Sql Developer`|
|SCM|`Git & Github`|
|ETC.|`Notion`, `Kakaotalk`, `ChatGPT` 등|

## 주요 기능

## 주요 작업 내용

## 프로젝트 아키텍쳐

## 클라이언트 화면 UI

## 기타
> ### DB ERD

<details>
<summary>DB ERD 보기</summary>
<div markdown="1">

 |![finalpjt_erd](https://github.com/user-attachments/assets/e089ae4f-fe98-44ad-860a-68801e706310)|
 |:---:|
 
</div>
</details>

> ### 프로젝트 흐름도

<details>
<summary>프로젝트 흐름도 보기</summary>
<div markdown="1">

 |![finalpjt_flow](https://github.com/user-attachments/assets/f1341d66-8b9d-4328-b079-1e86b2c1b0c9)|
 |:---:|
 
</div>
</details>

> ### 프로젝트 구조

<details>
<summary>프로젝트 구조 보기</summary>
<div markdown="1">
 
```
📦kosta_final_pjt_fullstack_review
┣ 📂.git
┣ 📂kosta_finalpjt
┃ ┣ 📂.mvn
┃ ┃ ┗ 📂wrapper
┃ ┃ ┃ ┗ 📜maven-wrapper.properties
┃ ┣ 📂.settings
┃ ┣ 📂src
┃ ┃ ┣ 📂main
┃ ┃ ┃ ┣ 📂java
┃ ┃ ┃ ┃ ┗ 📂com
┃ ┃ ┃ ┃ ┃ ┗ 📂example
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂demo
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mariaDBConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜oracleDBConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mariadb
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domains
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜virtual_domains.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜virtual_domains_dto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜virtual_domains_jpa.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mail
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mailSenderFactory.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mailSenderFactoryImpl.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mail_controller.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜mail_service.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂users
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜virtual_users.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜virtual_users_dao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜virtual_users_dto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜virtual_users_service.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂oracledb
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂auth
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyFailureHandler.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MySuccessHandler.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyUserDetails.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyUserDetailsService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SecurityConfiguration.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂charts
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Charts.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartsController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartsDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartsDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ChartsService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂chat
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂Manager
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BatchConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂Message
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Message.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WebFileConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebSocketConfig.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂Room
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoom.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomName.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomNameDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomNameDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRoomNameService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ChatRoomService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂RoomUser
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoomUser.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoomUserDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoomUserDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RoomUserService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂depts
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Depts.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeptsController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeptsDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeptsDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeptsService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Joblvs.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JoblvsDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JoblvsDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜JoblvsService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂docx
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Docx.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DocxController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DocxDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DocxDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DocxService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂members
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EduWorkExperienceInfo.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EduWorkExperienceInfoDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EduWorkExperienceInfoDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EduWorkExperienceInfoService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Members.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MembersController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MembersDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MembersDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MembersService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂users
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Users.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersAbstractValidator.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersCheckIdValidator.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersCheckUsernmValidator.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UsersEqualPwdValidator.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UsersService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂weather
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WeatherController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂workinoutrecords
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChartDeptMember.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeptsYearWorkData.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemRecord.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OverWorkData.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WorkInOutRecord.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WorkInOutRecordController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WorkInOutRecordDao.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WorkInOutRecordDto.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WorkInOutRecordService.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HomeController.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜KostaFinalpjtApplication.java
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ServletInitializer.java
┃ ┃ ┃ ┣ 📂resources
┃ ┃ ┃ ┃ ┣ 📂static
┃ ┃ ┃ ┃ ┃ ┣ 📂css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂charts
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜charts.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜charts_calendar.css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂chat
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chatdesign.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chatreset.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜weather.css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜header.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜leftnav.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜modal.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜reset.css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂corp
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜dept.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜joblv.css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂user
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜member.css
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜user.css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜main.css
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜record.css
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜userform.css
┃ ┃ ┃ ┃ ┃ ┣ 📂img
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂chat
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chatedit.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜chatRoomImg.png
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜calendar.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜card.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜card2.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chat.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜check.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜check_1.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜exit.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜home.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜human.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mail.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜paper.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜setting.png
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜time.png
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂member
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜abstract-6047465_1920 (test_user0).jpg
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂record
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜timer.png
┃ ┃ ┃ ┃ ┃ ┣ 📂js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂corp
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜corp.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂record
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜record_admin.js
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜record_common.js
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜record_dept.js
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜record_emp.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜charts.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜charts_calendar.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜charts_gantt.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chat.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chat_modal.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜docxMain.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜login.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mailserver.js
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜memmodal.js
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜weather.js
┃ ┃ ┃ ┃ ┃ ┣ 📜test.css
┃ ┃ ┃ ┃ ┃ ┗ 📜test.jsp
┃ ┃ ┃ ┃ ┣ 📂templates
┃ ┃ ┃ ┃ ┃ ┣ 📂auth
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂charts
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Calendar.html
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Gantt.html
┃ ┃ ┃ ┃ ┃ ┣ 📂chat
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜bootchat.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜chatroomlist.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜chatstart.html
┃ ┃ ┃ ┃ ┃ ┣ 📂common
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜footer.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜header.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜leftbar.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜leftnav.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜memmodal.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜modal.html
┃ ┃ ┃ ┃ ┃ ┣ 📂corp
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜deptadd.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜deptinfo.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜deptlist.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜joblvadd.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜joblvinfo.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜joblvlist.html
┃ ┃ ┃ ┃ ┃ ┣ 📂docx
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜add.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜addindex.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜addmeet.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜addreport.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜addvacation.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜approved.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜detail.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜list.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜mylist.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜unapproved.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜vacationdetail.html
┃ ┃ ┃ ┃ ┃ ┣ 📂mail
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜list.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜page.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜post.html
┃ ┃ ┃ ┃ ┃ ┣ 📂member
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜list.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜memberedit.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜memberinfo.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜memberlist.html
┃ ┃ ┃ ┃ ┃ ┣ 📂record
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜admin.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜dept.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜my.html
┃ ┃ ┃ ┃ ┃ ┣ 📂user
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜useredit.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜userinfo.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜userjoin.html
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜userlist.html
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜userlogin.html
┃ ┃ ┃ ┃ ┃ ┣ 📜error.html
┃ ┃ ┃ ┃ ┃ ┣ 📜header.html
┃ ┃ ┃ ┃ ┃ ┣ 📜index.html
┃ ┃ ┃ ┃ ┃ ┣ 📜index_admin.html
┃ ┃ ┃ ┃ ┃ ┗ 📜index_emp.html
┃ ┃ ┃ ┃ ┗ 📜application.properties
┃ ┃ ┃ ┗ 📂webapp
┃ ┃ ┗ 📂test
┃ ┃ ┃ ┗ 📂java
┃ ┃ ┃ ┃ ┗ 📂com
┃ ┃ ┃ ┃ ┃ ┗ 📂example
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂demo
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜KostaFinalpjtApplicationTests.java
┃ ┣ 📂target
┃ ┃ ┣ 📂classes
┃ ┃ ┣ 📂generated-sources
┃ ┃ ┣ 📂generated-test-sources
┃ ┃ ┣ 📂m2e-wtp
┃ ┃ ┗ 📂test-classes
┃ ┣ 📜.classpath
┃ ┣ 📜.factorypath
┃ ┣ 📜.gitignore
┃ ┣ 📜.project
┃ ┣ 📜HELP.md
┃ ┣ 📜mvnw
┃ ┣ 📜mvnw.cmd
┃ ┗ 📜pom.xml
┗ 📜README.md
```

</div>
</details>

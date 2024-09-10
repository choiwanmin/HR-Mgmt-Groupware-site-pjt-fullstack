# KOSTA FINAL PROJECT<br/>(`HRD&GROUPWARE SYSTEM` 웹 풀스택 개발)
*※ 기존에 수행한 https://github.com/choiwanmin/kosta_final_pjt 프로젝트를 정비 및 정리*

## 목차
 * [프로젝트 소개](#프로젝트-소개)
 * [기술 스택](#기술-스택)
 * [주요 기능](#주요-기능)
 * [클라이언트 화면 UI](#클라이언트-화면-UI)
 * [기타](#기타)

## 프로젝트 소개
> ### 프로젝트 개요
 * `java`기반의 `Spring Boot` 프레임워크를 활용한 웹 풀스택 개발
 * 개발 기간 : 2024.05.24 ~ 2024.06.26 (34일)
 * 개발 구성원 : 5명 (`FullStack` - 각 담당 영역의 FullStack 작업을 진행)
> ### 프로젝트 목표
 * 팀 및 서비스 목표
   * 사내 사용자가 각기 별개의 작업 환경에서 통합된 하나의 프로젝트를 동시에 수행할 수 있도록 도움을 주는 소프트웨어를 제작
   * 관리자와 사원의 영역을 나누어 업무를 정형화함으로써 업무 생산성 향상을 목적에 둠

## 기술 스택
|구분|사용 기술|
|:---|:---|
|Front-end|`HTML`, `CSS`, `Javascript`, `Bootstrap`, `Thymeleaf`, `Ajax`, `JQuery`|
|Back-end|`Java`, `Maven`, `Spring Boot`, `Spring Data JPA`, `JDBC API`, `Oracle Driver`, <br/>`Lombok`, `Spring Security`, `WebSocket` 등|
|DBMS|`Oracle`|
|Server|`Apache Tomcat`|
|IDE|`Eclipse`, `IntelliJ`, `Oracle Sql Developer`|
|SCM|`Git & Github`|
|ETC.|`Notion`, `Kakaotalk`, `ChatGPT` 등|

## 주요 기능
> ### 인사 관리 기능

  <details>
  <summary>인사 관리 기능 보기</summary>
  <div markdown="1">
  
  * 사원 정보 관리 기능
    * 시스템 로그인 정보 관리
    * 인사 정보 관리
    * 시스템 승인 상태 관리
  * 근태 관리 기능
    * 사원 개인별 출퇴근 기록
    * 출퇴근 기록 조회 및 휴가 관리
    * 관리자 및 부서장은 부서별 근태 기록 조회 및 통계 제공
  * 조직 관리
    * 부서 관리
    * 직급 관리 

  </div>
  </details>
  
> ### 협업 도구 기능

  <details>
  <summary>협업 도구 기능 보기</summary>
  <div markdown="1">
  
  * 공지 게시판 기능
    * 전체 및 부서별 조회 및 작성 기능 
  * 실시간 메신저 기능
    * 실시간 1:1 메신저 및 그룹 메신저 제공
    * 현재 대화 참여자 정보 조회
    * 메신저 및 메시지 관리를 통한 최신화
  * 전자 문서 기능
    * 문서 기본 양식 제공으로 빠른 문서 작성
    * 결재 권한 및 순서를 제공해 원격 결재 시스템 제공
    * 내가 작성한 문서 모아보기 기능
    * 결재 문서 현황 확인 제공
  * 스케줄러 기능
    * 사내 또는 개인 주요 일정관리 기능 제공
    * 일정 추가시 달력과 간트차틍 적용하여 편의성 제공
    * 임직원간 일정 공유 기능 제공
  * 메일 기능
    * 그룹웨어 자체 메일 서버 제공
    * 자체 도메인 제공으로 사내메일 사용 가능
    * 메일함에서 받은 메일 관리
    * 반송, 공유 등 편의 기능 제공

  </div>
  </details>

## 클라이언트 화면 UI
*※ 2024/07/15 기준 데이터 UI*
> ### 메인 관련 페이지

<details>
<summary>메인 관련 페이지 보기</summary>
<div markdown="1">
 
 |메인(로그인)|회원가입|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (1)](https://github.com/user-attachments/assets/d01d8cd1-0fbd-476e-8596-66437923fee9)|![finalpjt_fullstack_ui (2)](https://github.com/user-attachments/assets/d3abe184-391f-45d8-a0d8-93be4882763a)|

</div>
</details>

> ### 관리자 페이지

<details>
<summary>관리자 페이지 보기</summary>
<div markdown="1">
 
 |관리자 메인|사원 근태 관리(근무 시간)|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (3)](https://github.com/user-attachments/assets/6eb77614-098e-457b-b90c-dff830b0c3bb)|![finalpjt_fullstack_ui (4)](https://github.com/user-attachments/assets/96099192-9a63-4c47-b64f-dc85c583aa8d)|

 |사원 근태 관리(초과 근무)|사원 근태 관리(부서 선택)|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (5)](https://github.com/user-attachments/assets/1e3c370d-1fe6-4141-9a68-2246bcf4e295)|![finalpjt_fullstack_ui (6)](https://github.com/user-attachments/assets/cabfa7fa-ce1d-46e7-9881-7c4cf512b309)|

 |직원 목록|사용자 로그인 정보|사용자 로그인 정보 수정|직원 이력 정보|직원 이력 정보 수정|
 |:---:|:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (7)](https://github.com/user-attachments/assets/5df284f6-206d-48db-b14b-b7dcd1d0c665)|![finalpjt_fullstack_ui (8)](https://github.com/user-attachments/assets/6f3ac6f6-6ff7-4f68-8242-925bc18fc89f)|![finalpjt_fullstack_ui (9)](https://github.com/user-attachments/assets/a1f3116c-f51b-468c-90e0-44fd1e2c4bcc)|![finalpjt_fullstack_ui (10)](https://github.com/user-attachments/assets/0a4f9746-9e12-4daf-979c-cf887292e2d9)|![finalpjt_fullstack_ui (11)](https://github.com/user-attachments/assets/f22cecd6-e3f8-454f-84f6-06a36684ac1f)|

 |부서 목록|부서 추가|부서 상세|부서 수정|
 |:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (12)](https://github.com/user-attachments/assets/76135498-2175-40c2-8ece-a95eebc5b2a2)|![finalpjt_fullstack_ui (13)](https://github.com/user-attachments/assets/d852e51a-4e68-4cef-a6fa-e04fe9b19b05)|![finalpjt_fullstack_ui (14)](https://github.com/user-attachments/assets/8fb4d9eb-13ca-4d3d-bae1-e9d000588a5d)|![finalpjt_fullstack_ui (15)](https://github.com/user-attachments/assets/30f86dfb-bb5b-4852-bbbc-dbe20aa6a65a)|

 |직급 목록|직급 추가|직급 상세|직급 수정|
 |:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (16)](https://github.com/user-attachments/assets/610fa867-626c-49e8-898b-82cc80582cee)|![finalpjt_fullstack_ui (17)](https://github.com/user-attachments/assets/fa52e874-c2a9-4dc5-a351-6870adf12408)|![finalpjt_fullstack_ui (18)](https://github.com/user-attachments/assets/7dfb73fc-540c-4be4-afff-6b8fe8b9b9c4)|![finalpjt_fullstack_ui (19)](https://github.com/user-attachments/assets/a0c5a9dc-5e81-4ccb-b459-7c48737f5bc5)|
  
</div>
</details>

> ### 직원 페이지

<details>
<summary>직원 메인 페이지 보기</summary>
<div markdown="1">

 |직원 메인|출퇴근 관리|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (20)](https://github.com/user-attachments/assets/3c23ad82-0dcf-4e87-a973-3a32d97ee298)|![finalpjt_fullstack_ui (21)](https://github.com/user-attachments/assets/8d2e38aa-e19f-48ba-b2e2-1209325e14e2)|

 |내 로그인 정보|내 이력 정보|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (22)](https://github.com/user-attachments/assets/8bfd5058-554d-4df6-b45a-147dcb28fbaa)|![finalpjt_fullstack_ui (23)](https://github.com/user-attachments/assets/7dc26278-b0db-4b52-b645-01e257ff08ac)|

 |부서장(직원) 메인|부서 근태관리|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (24)](https://github.com/user-attachments/assets/96777272-9798-483f-8bdf-ce7b33367d5b)|![finalpjt_fullstack_ui (25)](https://github.com/user-attachments/assets/31bc1d2c-ad52-4da0-82b3-48d47aaec4e2)|
 
</div>
</details>

<details>
<summary>스케줄러 페이지 보기</summary>
<div markdown="1">

 |스케줄러 메인|간트차트로 보기|달력으 보기|일정 추가|
 |:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (26)](https://github.com/user-attachments/assets/8fd7aea7-f6dc-4f67-8006-6a97c2ee9a32)|![finalpjt_fullstack_ui (27)](https://github.com/user-attachments/assets/eb47f68c-7784-46ad-b281-b4965f2621c8)|![finalpjt_fullstack_ui (28)](https://github.com/user-attachments/assets/865ed4ef-938c-48e1-8aad-ad8fc2ed5a9a)|![finalpjt_fullstack_ui (29)](https://github.com/user-attachments/assets/528866ab-eaa0-42cf-a2af-74a71c0115b8)|


</div>
</details>

<details>
<summary>채팅 페이지 보기</summary>
<div markdown="1">

 |채팅 메인|채팅 상대 초대|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (30)](https://github.com/user-attachments/assets/b09ea10a-04d2-4c89-9e65-b90863ba864d)|![finalpjt_fullstack_ui (31)](https://github.com/user-attachments/assets/c706919b-06ec-4316-8777-76fe6840d10f)|

 |1:1 대화|그룹 대화|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (32)](https://github.com/user-attachments/assets/cba94419-0840-427f-ad6b-73bc065b7669)|![finalpjt_fullstack_ui (33)](https://github.com/user-attachments/assets/201f67c7-b41f-4aaa-aebb-458565cacd28)|

 |대화방 이름 변경|대화 상대 정보 조회|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (34)](https://github.com/user-attachments/assets/b6b43de1-34c2-4396-a13c-eecf2953ab0d)|![finalpjt_fullstack_ui (35)](https://github.com/user-attachments/assets/569ebc9c-9032-4f54-8bb6-51407caa3fd5)|

</div>
</details>

<details>
<summary>문서 페이지 보기</summary>
<div markdown="1">

 |문서함 메인|내 문서 목록|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (36)](https://github.com/user-attachments/assets/771aec41-864b-4a7b-bea1-ec3e54bb3134)|![finalpjt_fullstack_ui (37)](https://github.com/user-attachments/assets/4023a0a6-e31f-4643-8c61-88f395482232)|

 |문서 작성|문서 상세 페이지|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (38)](https://github.com/user-attachments/assets/1820c582-03b9-4424-92f1-3bd8cb1dd833)|![finalpjt_fullstack_ui (39)](https://github.com/user-attachments/assets/3be49cf1-221a-4acd-830f-cfb76276c61d)|

</div>
</details>

<details>
<summary>공지 게시판 페이지 보기</summary>
<div markdown="1">
 
</div>
</details>

<details>
<summary style="color:blue;">메일 페이지 보기</summary>
<div markdown="1">
 
</div>
</details>

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
```

</div>
</details>

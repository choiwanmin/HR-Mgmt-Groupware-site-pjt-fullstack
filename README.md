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
 * 개발 구성원 : 5명 (`FullStack` - 각 담당 영역의 FullStack 작업을 진행)
> ### 프로젝트 목표
 * 팀 및 서비스 목표
   * 사내 사용자가 각기 별개의 작업 환경에서 통합된 하나의 프로젝트를 동시에 수행할 수 있도록 도움을 주는 소프트웨어를 제작
   * 관리자와 사원의 영역을 나누어 업무를 정형화함으로써 업무 생산성 향상을 목적에 둠
 * 개인 목표 : 

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

## 주요 작업 내용

## 프로젝트 아키텍쳐

## 클라이언트 화면 UI
*※ 2024/00/00 기준 데이터 UI*
> ### 메인 관련 페이지

<details>
<summary>메인 관련 페이지 보기</summary>
<div markdown="1">
 
 |메인(로그인)|회원가입|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (2)](https://github.com/user-attachments/assets/837debc9-9698-4c62-bd50-38813fe93b6e)|![finalpjt_fullstack_ui (3)](https://github.com/user-attachments/assets/213bc489-852c-4af0-bb6c-8360b7c72368)|

</div>
</details>

> ### 관리자 페이지

<details>
<summary>관리자 페이지 보기</summary>
<div markdown="1">
 
 |관리자 메인|사원 근태 관리(근무 시간)|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (5)](https://github.com/user-attachments/assets/fddaa42b-c0a9-4bda-9cdc-e5608b43d8e0)|![finalpjt_fullstack_ui (6)](https://github.com/user-attachments/assets/8900313b-d12f-4411-9e56-c5718da4bf9d)|

 |사원 근태 관리(초과 근무)|사원 근태 관리(부서 선택)|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (7)](https://github.com/user-attachments/assets/4814ca3e-590a-4ea2-a175-4e34edbe0222)|![finalpjt_fullstack_ui (8)](https://github.com/user-attachments/assets/648ffc46-8191-490c-9686-55cb85545914)|

 |직원 목록|사용자 로그인 정보|사용자 로그인 정보 수정|직원 이력 정보|직원 이력 정보 수정|
 |:---:|:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (9)](https://github.com/user-attachments/assets/7a02f46b-7d59-458b-ab61-a842e9ca1405)|![finalpjt_fullstack_ui (10)](https://github.com/user-attachments/assets/55db44a9-06a0-4a22-8478-a499964b3a36)|![finalpjt_fullstack_ui (11)](https://github.com/user-attachments/assets/7679cbca-eb3a-44e8-8fb0-aa9ed738dc82)|![finalpjt_fullstack_ui (12)](https://github.com/user-attachments/assets/5f0b24a3-10ed-4aee-9cd0-111d9c4605a6)|![finalpjt_fullstack_ui (44)](https://github.com/user-attachments/assets/4070d845-cf8b-4cd3-938f-63f1458a76d1)|

 |부서 목록|부서 추가|부서 상세|부서 수정|
 |:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (13)](https://github.com/user-attachments/assets/e40b1cd6-d681-47d5-bb09-31c2b65f8d09)|![finalpjt_fullstack_ui (14)](https://github.com/user-attachments/assets/5d6a85c7-1fec-43aa-a9b5-52faaa5c4438)|![finalpjt_fullstack_ui (15)](https://github.com/user-attachments/assets/253dc158-a34a-4146-85fa-9111399d84d2)|![finalpjt_fullstack_ui (16)](https://github.com/user-attachments/assets/735279aa-b590-4a2d-bef6-5621b8065ad1)|

 |직급 목록|직급 추가|직급 상세|직급 수정|
 |:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (17)](https://github.com/user-attachments/assets/24447b61-bbcc-4f12-a730-ed0d51286476)|![finalpjt_fullstack_ui (18)](https://github.com/user-attachments/assets/9e90161a-105e-42dc-9cf2-c401603123b7)|![finalpjt_fullstack_ui (19)](https://github.com/user-attachments/assets/2757c91f-bf3d-41b9-ad01-1b15681d5ec5)|![finalpjt_fullstack_ui (20)](https://github.com/user-attachments/assets/3e3b8848-bfb9-4ba5-8a55-503846ab7b42)|
  
</div>
</details>

> ### 직원 페이지

<details>
<summary>직원 메인 페이지 보기</summary>
<div markdown="1">

 |직원 메인|출퇴근 관리|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (21)](https://github.com/user-attachments/assets/2435f7f1-7eaa-407b-84a9-17f8882933e9)|![finalpjt_fullstack_ui (22)](https://github.com/user-attachments/assets/97e366ed-9488-485e-9934-b96941d8dcaa)|

 |내 로그인 정보|내 이력 정보|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (23)](https://github.com/user-attachments/assets/9ba65b02-8178-472f-9e6a-c725041b686f)|![finalpjt_fullstack_ui (24)](https://github.com/user-attachments/assets/3cca83c2-f471-4676-9b8e-77a35ca4e6f8)|

 |부서장(직원) 메인|부서 근태관리|
 |:---:|:---:|
 |![finalpjt_fullstack_ui (35)](https://github.com/user-attachments/assets/354de602-976b-43a1-94ed-9c9a3b1b3759)|![finalpjt_fullstack_ui (36)](https://github.com/user-attachments/assets/55a964aa-0c5e-43dd-b193-55ccaf9b0025)|
 
</div>
</details>

<details>
<summary>스케줄러 페이지 보기</summary>
<div markdown="1">

 |스케줄러 메인|간트차트로 보기|달력으 보기|일정 추가|
 |:---:|:---:|:---:|:---:|
 |![finalpjt_fullstack_ui (41)](https://github.com/user-attachments/assets/d385b4a0-0f34-4a68-9117-0f3664c1efde)|![finalpjt_fullstack_ui (42)](https://github.com/user-attachments/assets/68f97326-69d7-47ec-b58f-63142c808dbf)|![finalpjt_fullstack_ui (43)](https://github.com/user-attachments/assets/d40fd1b0-3904-4c64-9d57-8cd1eb68a04d)|![finalpjt_fullstack_ui (1)](https://github.com/user-attachments/assets/2026475d-5e30-457b-b988-839eb4ec4e6d)|


</div>
</details>

<details>
<summary>채팅 페이지 보기</summary>
<div markdown="1">

 |채팅 메인|채팅 멤버 초대|
 |:---:|:---:|
 |||

 |1:1 채팅|그룹 채팅|
 |:---:|:---:|
 |||

 |채팅 대화|첨부 파일 전달|
 |:---:|:---:|
 |||

</div>
</details>

<details>
<summary>문서 페이지 보기</summary>
<div markdown="1">

 |문서함 메인|내 문서함|
 |:---:|:---:|
 |||

 |문서 작성|문서 상세 페이지|
 |:---:|:---:|
 |||

</div>
</details>

<details>
<summary> 메일 페이지 보기</summary>
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

--운영db

select * from notexistsinprd;
--테스트 코드가 실행되기 전 rangers 데이터 삭제 


delete from rangers;
delete from jspuser;

--rangers 초기 데이터 3건 입력 

 insert into rangers values('brown','브라운');
 insert into rangers values('sally','샐리');
 insert into rangers values('cony','코니');
 
 --jspuser 데이터 초기화 
insert into jspuser values ('brown','브라운','f01471c38113db263f9a532d8b6c054af31bf653aeea92d1c284cdd022b9','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','brown@gmail.con','123123123','D:/A_TeachingMaterial/6.JspSrpgin/upload/brown.png');
insert into jspuser values ('sally','샐리','sallypass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/04/27','sally@gmail.con','123123123','D:\\A_TeachingMaterial\\6.JspSrpgin\\upload');
insert into jspuser values ('cony','코니','conypass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','cony@gmail.con','123123123','/profile/james.png');
insert into jspuser values ('moon','문','moonpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/06','moon@gmail.con','123123123','/profile/moon.png');
insert into jspuser values ('james','제임스','jamespass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','james@gmail.con','123123123','/profile/james.png');
insert into jspuser values ('xxxx1','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx2','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx3','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx4','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx5','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx6','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx7','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx8','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx9','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx10','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx11','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx12','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx13','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx14','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx15','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx16','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx17','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx18','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx19','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx20','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx21','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx22','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx23','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx24','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx25','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx26','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx27','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx28','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx29','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx30','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx31','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx32','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx33','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx34','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx35','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx36','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx37','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx38','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx39','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx40','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx41','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx42','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx43','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx44','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx45','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx46','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx47','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx48','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx49','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx50','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx51','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx52','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx53','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx54','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx55','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx56','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx57','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx58','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx59','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx60','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx61','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx62','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx63','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx64','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx65','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx66','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx67','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx68','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx69','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx70','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx71','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx72','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx73','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx74','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx75','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx76','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx77','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx78','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx79','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx80','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx81','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx82','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx83','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx84','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx85','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx86','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx87','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx88','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx89','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx90','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx91','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx92','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx93','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx94','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx95','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx96','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx97','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx98','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx99','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','');
insert into jspuser values ('xxxx100','xxxx','xxxxpass','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','xxxx@gmail.con','123123123','/profile/moon.png');
insert into jspuser values ('userId01','testUserId','userId01','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('test2','test','test','test','test','1234','18/08/08','test','test','/profile/moon.png');
insert into jspuser values ('tete','testUserId','tete','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/ryan.png');
insert into jspuser values ('tete3','testUserId','tete3','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('tete4','testUserId','tete4','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('intro','testUserId','intro','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/introBackground.jpg');
insert into jspuser values ('erer3','testUserId','erer3','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/brown2.png');
insert into jspuser values ('brownpower','testUserId','123','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/개념ERD.jpg');


--월단위 달력 생성 데이터 초기화 
delete from calendar where ymd like('201811%');



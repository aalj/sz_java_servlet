--传入一个课程号，获得这个课程的平均成绩

delimiter //
create  procedure scoreavg(icno int)
begin
	select avg(cgrade) from sc where cno=icno;
end //
delimiter ;
--写一个存储过程，传入一个课程号，输出
--   学生的姓名、成绩

delimiter //
create procedure showi(icno int )
begin
	--声明两个变量，放置从游标中获取的数据
	declare name varchar(20);
	declare score varchar(10);
	--声明标记
	declare flag int default 0;
	--声明一个游标
	declare stu_cur cursor for 
	select s.sname,sc.cgrade from student s,sc where sc.sno=s.sno and sc.cno=icno;
	--当从游标中取不到数据时 flag为1
	declare continue handler for not found set flag = 1; 
	--打开游标
	open stu_cur;
	--从游标中获取到数据
	fetch stu_cur into name, score ;
	while flag<>1 do
	select concat(name,',',score);
	fetch stu_cur into name,score;
	end while;
	close stu_cur;
	
end //
delimiter ;

delimiter //
create procedure show2(icno int)
begin
declare flag int default 0;
declare name varchar(20);
declare score varchar(20);
declare  student_sc cursor for
select s.sname ,sc.cgrade from student s,sc where s.sno=sc.sno and sc.cno=icno;
declare continue handler for not found set flag=1;
open student_sc;
fetch student_sc into name,score;
while flag<>1 do
	select concat(name,',',score);
	fetch student_sc into name , score;
end while;
close student_sc;
end //
delimiter ;



























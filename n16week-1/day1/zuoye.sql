--����һ���γ̺ţ��������γ̵�ƽ���ɼ�

delimiter //
create  procedure scoreavg(icno int)
begin
	select avg(cgrade) from sc where cno=icno;
end //
delimiter ;
--дһ���洢���̣�����һ���γ̺ţ����
--   ѧ�����������ɼ�

delimiter //
create procedure showi(icno int )
begin
	--�����������������ô��α��л�ȡ������
	declare name varchar(20);
	declare score varchar(10);
	--�������
	declare flag int default 0;
	--����һ���α�
	declare stu_cur cursor for 
	select s.sname,sc.cgrade from student s,sc where sc.sno=s.sno and sc.cno=icno;
	--�����α���ȡ��������ʱ flagΪ1
	declare continue handler for not found set flag = 1; 
	--���α�
	open stu_cur;
	--���α��л�ȡ������
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



























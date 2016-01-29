//验证函数
//函数，验证字符串是合法的QQ号码
function isQQ1(qq)
{
	
	var re  = /^[1-9]\d{4,10}$/;
	//使用test验证
	return re.test(qq);
}

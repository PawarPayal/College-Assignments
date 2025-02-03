<?php
$a=$_GET['txt1'];
$c$_GET['op'];
switch($ch)
{
case 1:length($a);
break;
case 2:count($a);
break;
case 3:lowercase($a);
break;
case 4:padboth($a);
break;
case 5:rmwhite($a);
break;
case 6:reverse($a);
break;
}
function lowercase($a)
{
$b=strlower($a);
echo $b;
$c=vewords($b);
echo $c;
}
function padboth($a)
{
echo str_pad($a,20,"*",STR_PAD_BOTH);
}
function rmwhite($a)
{
echo trim($a)
}
function reverse($a)
{
echo strrev($a);
}
function count($a)
{
$string=strlower($a);
$vowles=array('a','e','i','o','u');
$len=strlen($string);
$num=0;
for($i=0;$i<$len;$i++)
{
if(in_array($string[$i],$vowels))
{
$num++;
}
}
echo "no of vowels",$num;
}
function length($a)
{
$str="$a";
$i=0;
while(@$str[$i++]!=NULL);
$i--;
echo "length is" ,$i;
}
?>


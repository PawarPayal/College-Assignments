<?php
$a=$_GET['no1'];
$b=$_GET['no2'];
$ch=$_GET['op'];
switch($ch)
{
case 1:mod($a,$b);
break;
case 2:Power($a,$b);
break;
case 3:sumN($a);
break;
case 4:fact($b);
break;
}
function mod($a,$b)
{
$c=$a%$b;
echo "Mod of first  and Secound  numbers: ";
echo $c;
}

function Power($a,$b)
{
$finalnum=1;
$n1=$b;
while($n1>0)
{
$finalnum=$finalnum*$a;
$n1--;
}
echo "$a raised to power $b=$finalnum\n";
}
function sumN($a)
{
$num=$a;
$n=$sum;
$sum=0;
while($n>=0)
{
$sum=$sum+$n;
$n--;
}
echo"sum of $num number is :$num";
}
function fact($b)
{
$num=$b;
$factorial=1;
for($x=$sum;$x>=1;$x--)
{
$factorial=$factorial*$x;
}
echo "Factorial of $num is $factorial";
}
?>

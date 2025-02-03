<?php
$given=array('1','2','3','4','5');
echo "given array:" . "\n";
foreach($given as $x)
{
echo "$x";
}
$inserted='@';
array_splice($given,3,0,$inserted);
echo "\n After inserting '@' the array is:" ."\n";
foreach($given as $x)
{
echo "$x";
}
echo"\n";
?>

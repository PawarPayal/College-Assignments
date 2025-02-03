<?php
function search($value,$array)
{
return (array_search($value,$array));
}
$array=array(
"ram",
"aakash",
"saran",
"mohan",
"saran"
);
$value="mohan";
print_r(search($value,$array));
?>

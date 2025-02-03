<?php
$myfile=fopen("somefile.txt","r") or die("Unable to open file!");
echo file_get_contents("somefile.txt");
echo fread($myfile);
echo filesize("somefile.txt");
fclose($myfile);
?>

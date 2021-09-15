<?php
include 'config.php';
include 'simple_html_dom.php';

$karakter="https://www.gensh.in/characters";
$html =file_get_html($karakter);
//$variable=$html->find('div[class=row character-list]');

for($i=0; $i < 42; $i++)
{

    foreach ($html->find('div[class=row character-list]') as $variable)
    {
        $link=$variable->children(0)->children(0)->children(0)->children(0)->children(0)->src;
        $name=$variable->children(0)->children(0)->children(1)->children(0)->plaintext;
        $type=$variable->children(0)->children(0)->children(1)->children(1)->plaintext;
        //mysqli_query($db_connection,"INSERT INTO karakter (link_img,nama_karakter,tipe_karakter) VALUES ('$link','$name','$type')");
        echo $name;
        echo $type;
        echo $link;
    }
}
  
?>
<?php
include 'config.php';
include 'simple_html_dom.php';

$karakter="https://www.gensh.in/characters";
//$html =file_get_html('karakter.html');
$html =file_get_html($karakter);
foreach ($html->find('div[class=row character-list]') as $nama)
{
    $link=$nama->children(2)->children(0)->children(0)->children(0)->children(0)->src;
    $name=$nama->children(2)->children(0)->children(1)->children(0)->plaintext;
    $type=$nama->children(2)->children(0)->children(1)->children(1)->plaintext;

    //mysqli_query($db_connection,"INSERT INTO karakter (link_img,nama_karakter,tipe_karakter) VALUES ('$link','$name','$type')");
    echo $name;
    echo $type;
    echo $link;
    echo "<br/>";
}
?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
#main-container
{
   min-height: 400px;
   margin: 0 0 0 125px;
   padding: 20px;
   background-color: #fff;
   border: 1px solid #888;
}
</style>
<div id="content">
	<div id="main-container">
      <h1 align="center"> 상품 등록</h1>
      <br/><br/>
      <ul>
      	<li>
      		카테고리 &nbsp;
			<select name="goodsCate">
			    <option value="">상품 종류</option>
			    <option value="">상품 종류</option>
			    <option value="">상품 종류</option>
			    <option value="">상품 종류</option>
			</select>
      	</li>
      	<li>
      		작성자 &nbsp;&nbsp; <input type="text" id="seller" name="seller">
      	</li>
      	<li>
      		브랜드 &nbsp;&nbsp; <input type="text" id="brand" name="brand">
      		&nbsp;&nbsp;&nbsp;&nbsp;
      		모델명 &nbsp;&nbsp; <input type="text" id="modelName" name="modelName">
      	</li>
      	<li>
      		중고상태 &nbsp;&nbsp;
			<select name="goodsStat">
			    <option value="">A</option>
			    <option value="">B</option>
			    <option value="">C</option>
			    <option value="">D</option>
			</select>
      	</li>
      	<li>
      		가격 &nbsp;&nbsp; <input type="text" id="seller" name="seller">
      	</li>
      	<li>
      		제목 &nbsp;&nbsp; <input type="text" id="seller" name="seller">
      	</li>
      	<li>
      		상품정보 
			<br/>
			<textarea cols="50" rows="15"></textarea>
      	</li>
      	<li>
      		첨부파일 <input type="file" id="fileUpload" name="fileUpload" value="첨부">
      		<br><input type="button" id="addUpload" name="addUpload" value="파일추가">
      	</li>
      	<p align="right">
      		<input type="button" id="submit_product" name="submit_product" value="등록하기" onclick="">
      		&nbsp;
      		<input type="button" id="goList" name="goList" value="목록으로" onclick="">
      	</p>
      </ul>
	</div>
</div>
</body>
</html>
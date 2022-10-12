<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update-question">
		<h3>Enter The Question in the Form</h3>
		<table>
			<tr>
				<td><label>Question Id:</label></td>
				<td><input type="text" name="questionId" value="${questionObj.questionId}"></td>
			</tr>
			<tr>
				<td><label>Topic:</label></td>

				<td ><input type="radio" name="topic" value="${questionObj.topic}" checked="checked">
					<label>JAVA</label><br>
					 <input type="radio" name="topic" value="HTML" >
					  <label>HTML</label><br> 
				<input	type="radio" name="topic" value="General Knowledge"> 
					<label>General Knowledge</label><br>
						
			</tr>
			<tr>
				<td><label>Question :</label></td>
				<td><input type="text" name="question" value="${questionObj.question}"></td>
			</tr>
			
			<tr>
				<td><label>Option One:</label><br></td>
				<td><input type="text" name="optionOne" value="${questionObj.optionOne}"><br></td>

			</tr>
			<tr>
				<td><label>Option Two:</label></td>
				<td><input type="text" name="optionTwo" value="${questionObj.optionTwo}"></td>
			</tr>
			<tr>
				<td><label>Option Three:</label></td>
				<td><input type="text" name="optionThree" value="${questionObj.optionThree}"></td>

			</tr>
			<tr>
				<td><label>Option Four:</label></td>
				<td><input type="text" name="optionFour"value="${questionObj.optionFour}"></td>

			</tr>
			<tr>
				<td><label>Answer Id:</label></td>
				<td><input type="text" name="answerId" value="${answerObj.answerId}"></td>

			</tr>
			<tr>
				<td><label>Correct Answer value :</label></td>
				<td><input type="text" name="answerValue" ></td>

			</tr>
			<tr>
				<td><label>Add Question</label></td>
				<td colspan="2"><input type="submit" value="Add Question"></td>
			</tr>

		</table>


	</form>

</body>
</html>
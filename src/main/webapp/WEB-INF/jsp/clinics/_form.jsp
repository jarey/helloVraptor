<%@ page contentType="text/html; charset=UTF-8"%>

<div>
	<label for="clinic.name">Name</label> 
	<input type="text" name="clinic.name" value="${clinic.name }" />
</div>
<div>
	<label for="clinic.address">Address</label> 
	<input type="text" name="clinic.address" value="${clinic.address }" />
</div>
<div>
	<button type="reset">Clean Form</button>
	<button id="saveButton" type="submit">Save</button>
</div>
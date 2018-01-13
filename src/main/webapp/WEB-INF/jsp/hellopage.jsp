<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.js"></script>

<body>


	Message is: ${message} and name is : ${name}


	<div ng-app="myApp" ng-controller="myCtrl">
		{{ firstName + " " + lastName }}

		<table ng-controller="myCtrl" border="1">
			<tr ng-repeat="x in users">
				<td>{{x.id}}</td>
				<td>{{x.name}}</td>
				<td>{{x.country}}</td>
				<td>{{x.salary}}</td>
			</tr>
		</table>

		<br> <select ng-model="selectedCar">
			<option ng-repeat="x in users">{{x.name}}</option>
		</select>

		<h1>You selected: {{selectedCar}}</h1>

		<button type="submit">Add User</button>

		<button type="submit">Delete User</button>

		<button type="submit">Edit User</button>

		<li><a href="#about"><i class="fa fa-shield"></i>About</a></li>

	</div>

	<div id="main">
		<!-- angular templating : This is where content will be injected -->
		<div ng-view></div>
	</div>

	<script src="js/myApp.js"></script>
	<script src="js/myCtrl.js"></script>
	<script src="js/pageRouting.js"></script>

</body>
</html>


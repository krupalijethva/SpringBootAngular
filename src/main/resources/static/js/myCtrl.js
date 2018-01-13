app.controller('myCtrl', function($scope, $http) {
	$http.get("/user/").then(function(response) {
		//alert("dd " + response.data[1].name);
		$scope.users = response.data;

		$scope.firstName = "John2";
	});
});

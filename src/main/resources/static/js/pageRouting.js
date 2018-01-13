// configure our routes    
app.config(function($routeProvider) {
	$routeProvider

	// route for the about page
	.when('/about', {
		templateUrl : 'jsp/about.jsp',
		controller : 'aboutController'
	})

});

app.controller('aboutController', function($scope) {
	$scope.AboutMessage = 'About Controller Called !!!';
});


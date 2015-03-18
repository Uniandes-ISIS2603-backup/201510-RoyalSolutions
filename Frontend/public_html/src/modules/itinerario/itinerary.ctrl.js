(function () {
	var app = angular.module('itineraryModule');

	app.controller('itineraryCtrl', ['$scope', 'CRUDUtils', 'itinerary.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



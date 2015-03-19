(function () {
	var app = angular.module('calificationModule');

	app.controller('calificationCtrl', ['$scope', 'CRUDUtils', 'calification.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



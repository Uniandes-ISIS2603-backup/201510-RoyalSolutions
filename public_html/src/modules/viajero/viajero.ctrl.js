(function () {
	var app = angular.module('viajeroModule');

	app.controller('viajeroCtrl', ['$scope', 'CRUDUtils', 'viajero.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



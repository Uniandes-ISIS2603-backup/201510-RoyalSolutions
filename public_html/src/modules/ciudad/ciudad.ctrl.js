(function () {
	var app = angular.module('ciudadModule');

	app.controller('ciudadCtrl', ['$scope', 'CRUDUtils', 'ciudad.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



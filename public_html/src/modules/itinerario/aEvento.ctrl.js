(function () {
	var app = angular.module('aEventoModule');

	app.controller('aEventoCtrl', ['$scope', 'CRUDUtils', 'aEvento.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



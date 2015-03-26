(function () {
	var app = angular.module('entretenimientoModule');

	app.controller('entretenimientoCtrl', ['$scope', 'CRUDUtils', 'entretenimiento.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



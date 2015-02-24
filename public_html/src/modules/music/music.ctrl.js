(function () {
	var app = angular.module('musicModule');

	app.controller('musicCtrl', ['$scope', 'CRUDUtils', 'music.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);
})();



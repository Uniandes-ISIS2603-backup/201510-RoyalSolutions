(function () {
    var paisModule = angular.module('paisModule');

    paisModule.controller('paisCtrl', ['$scope', 'paisService', function ($scope, paisService) {
            paisService.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();
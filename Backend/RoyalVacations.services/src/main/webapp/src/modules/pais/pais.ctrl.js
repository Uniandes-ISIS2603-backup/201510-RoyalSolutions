(function (angular) {
    var paisModule = angular.module('paisModule');

    paisModule.controller('paisCtrl', ['$scope', '$rootScope', 'paisService', function ($scope, $rootScope, paisService) {
            paisService.extendCtrl(this, $scope);
            this.fetchRecords();
            
            
        }]);
})(window.angular);
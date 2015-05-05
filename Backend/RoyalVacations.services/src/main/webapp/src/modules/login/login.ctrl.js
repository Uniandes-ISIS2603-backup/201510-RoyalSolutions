(function (angular) {
    var loginModule = angular.module('loginModule');

    loginModule.controller('loginCtrl', ['$scope', 'loginService', function ($scope, loginService) {
            loginService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
        }]);
})(window.angular);
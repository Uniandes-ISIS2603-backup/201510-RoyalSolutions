(function () {
    var app = angular.module('loginModule');

    app.controller('userCtrl', ['$scope', 'CRUDUtils', 'login.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
             
    this.reg = function () {
        var nombreMundo = $scope.us.nombre;
        var mailMundo = $scope.us.mail;
        var pass1mundo = $scope.us.password;
        var pass2mundo = $scope.us.cpassword;
        if(pass1mundo !== pass2mundo)
        {
            alert("No coinciden los password");
        }
        		}}]);
})();
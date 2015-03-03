(function () {
    var app = angular.module('loginModule');

    app.controller('userCtrl', ['$scope', 'CRUDUtils', 'login.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
    
    this.reg = function () {
        var nombreMundo = $scope.us.nombre;
        var mailMundo = $scope.us.nombre;
        var pass1mundo = $scope.us.nombre;
        var pass2mundo = $scope.us.nombre;
        if(pass1mundo != pass2mundo)
        {
            alert("No coinciden los password")
        }
                            var date = $filter('date')($scope.user.dia,"dd '-' MMMM '-' yyyy");
                            $scope.mensaje= "El usuario " + $scope.user.firstName + " " + $scope.user.lastName+" nació el "+date
			};
})();
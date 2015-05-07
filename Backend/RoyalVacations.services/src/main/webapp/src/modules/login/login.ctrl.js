(function (angular) {
    var loginModule = angular.module('loginModule');

    loginModule.controller('loginCtrl', ['$scope', 'loginService', function ($scope, loginService) {
            loginService.extendCtrl(this, $scope);
            
            this.fetchRecords();
       
            loginService.fetchRecords().then(function(data){
                $scope.loginRecords = data;
            });
            
            this.validarUsuario = function(id,password){
                for(var i in $scope.loginRecords){
                    if ($scope.loginRecords[i].id === id ) {
                        if( $scope.loginRecords[i].password === password ) {
                           $scope.loginUsuarioActual = id; 
                           window.alert("Bienvenido" + id );
                        }   
                        else{
                            window.alert("Lo sentimos,login incorrecto");
                        }
                    }
                    else {
                        this.saveRecord;
                        $scope.loginUsuarioActual = id;
                    }
                }
            };
            
        }]);
})(window.angular);
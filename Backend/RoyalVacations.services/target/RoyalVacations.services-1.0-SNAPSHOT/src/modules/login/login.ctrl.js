(function (angular) {
    var loginModule = angular.module('loginModule');

    loginModule.controller('loginCtrl', ['$scope','$rootScope', 'loginService', function ($scope, $rootScope, loginService) {
            loginService.extendCtrl(this, $scope);
            
            this.fetchRecords();
       
            loginService.fetchRecords().then(function(data){
                $scope.loginRecords = data;
            });
            
            this.validarUsuario = function(id,password){
                for(var i in $scope.loginRecords){
                    if ($scope.loginRecords[i].login === id ) {
                        if( $scope.loginRecords[i].contrasena === password ) {
                           $rootScope.loginUsuarioActual = $scope.loginRecords[i].id; 
                           window.alert("Bienvenido " + id );
                        }   
                        else{
                            window.alert("Lo sentimos,contraseña incorrecto");
                        }
                    }
                }
            };
            
        }]);
})(window.angular);
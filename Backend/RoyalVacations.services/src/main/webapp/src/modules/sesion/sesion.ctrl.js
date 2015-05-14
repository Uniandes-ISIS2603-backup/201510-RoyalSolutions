(function (angular) {
    var sesionModule = angular.module('sesionModule');

    sesionModule.controller('sesionCtrl', ['$scope', '$rootScope', 'sesionService', 'loginService', function ($scope, $rootScope, sesionService, loginService) {
            sesionService.extendCtrl(this, $scope);
            
            this.fetchRecords();
       
            loginService.fetchRecords().then(function(data){
                $scope.loginRecords = data;
            });
            
            this.validarUsuario = function(id,password){
                for(var i in $scope.loginRecords){
                    if ($scope.loginRecords[i].login === id ) {
                        if( $scope.loginRecords[i].contrasena === password ) {
                           $rootScope.loginUsuarioActual = $scope.loginRecords[i].id; 
                           window.alert("Bienvenido" + id );
                        }   
                        else{
                            window.alert("Lo sentimos,login incorrecto");
                        }
                    }
                }
            };
            
        }]);
})(window.angular);
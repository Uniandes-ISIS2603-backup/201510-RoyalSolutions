(function (angular) {
    var loginModule = angular.module('loginModule');

    loginModule.controller('loginCtrl', ['$scope', 'loginService', function ($scope, loginService) {
            loginService.extendCtrl(this, $scope);
            
            this.fetchRecords();
       
            loginService.fetchRecords().then(function(data){
                $scope.loginRecords = data;
            });
            
            this.validarUsuario = function( ){
                window.alert("Estamos validando");
                for(var i in $scope.loginRecords){
                    if ($scope.loginRecords[i].id === currentRecord.id ) {
                        if( $scope.loginRecords[i].password === currentRecord.password ) {
                           $scope.loginUsuarioActual = currentRecord.id; 
                        }   
                        else{
                            window.alert("Lo sentimos,login incorrecto");
                        }
                    }
                    else {
                        this.saveRecord;
                        $scope.loginUsuarioActual = currentRecord.id;
                    }
                }
            };
            
        }]);
})(window.angular);
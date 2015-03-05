(function () {
    var app = angular.module('loginModule');

    app.controller('userCtrl', ['$scope', 'CRUDUtils', 'login.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();

            this.reg = function () {
                var nombreMundo = $scope.currentRecord.nombre;
                var mailMundo = $scope.currentRecord.mail;
                var pass1mundo = $scope.currentRecord.password;
                var pass2mundo = $scope.currentRecord.cpassword;
                if (pass1mundo !== pass2mundo)
                {
                    alert("No coinciden los password");
                }
                else if (mailMundo.includes("@") === false)
                {
                    alert("Mail no valido");
                }
                else if ($scope.records.length > 0)
                {
                    var arreglo = $scope.records;
                    for (i = 0; i < arreglo.length; i++)
                    {
                        if (arreglo[i].nombre === nombreMundo)
                        {
                            alert("Debe cambiar de usuario.");
                        }
                    }
                }
                else
                {
                    userCtrl.createRecord();
                    userCtrl.saveRecord();
                }
            }
            
            this.login = function () {
                if($scope.usuarioing==="admin")
                {
                    if($scope.passing==="admin")
                    {
                        alert("Es administrador");
                    }
                }
                else if ($scope.records.length > 0)
                {
                   alert("No existe el usuario");
                }
                else
                {
                    var arreglo = $scope.records;
                    var existe = false;
                    for (i = 0; i < arreglo.length; i++)
                    {
                        if (arreglo[i].nombre === $scope.usuarioing)
                        {
                            if(arreglo[i].password === $scope.passing){
                                alert("Usuario logeado");
                                existe = true;
                            }
                            else
                            {
                                alert("Error de contraseña");
                            }
                        }
                    }
                    if(existe===false)
                    {
                        alert("No existe usuario");
                    }
                }
            }
        }]);
})();
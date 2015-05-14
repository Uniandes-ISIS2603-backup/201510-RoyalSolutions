(function (angular) {
    var itinerarioModule = angular.module('itinerarioModule');

    itinerarioModule.controller('itinerarioCtrl', ['$scope', '$rootScope', 'itinerarioService', function ($scope, $rootScope, itinerarioService) {
            itinerarioService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
            this.guardar = function(fecha1, fecha2) {
                if(fecha1 < fecha2)
                {
                    $scope.currentRecord.usuario = $rootScope.loginUsuarioActual;
                    this.saveRecord();
                }
                else
                {
                    window.alert("La fecha de inicio debe ser anterior a la fecha final");
                }
            }
            
            this.formatearFecha = function(date) {
               var fechaStr = date.toString();
               fechaStr = fechaStr.split("T",1);
               return fechaStr[0];
            };
            
            this.darIdUsuario = function() {
               return $rootScope.loginUsuarioActual;
            };
            
            this.guardarItinerarioActual = function(idItinerario) {
               $rootScope.idItinerarioActual=idItinerario;
            };
            
        }]);
})(window.angular);
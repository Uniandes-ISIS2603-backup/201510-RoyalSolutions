(function (angular) {
    var visitaModule = angular.module('visitaModule');

    visitaModule.controller('visitaCtrl', ['$scope', 'visitaService','ciudadService','itinerarioService', function ($scope, visitaService, ciudadService, itinerarioService) {
            visitaService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
            this.formatearFecha = function(date) {
               var fechaStr = date.toString();
               fechaStr = fechaStr.split("T",1);
               return fechaStr[0];
            };
            
            this.guardar = function(fecha1, fecha2, idItinerario) {
                if(this.getItinerarioInicio(idItinerario) < fecha1 && fecha2 < this.getItinerarioFin(idItinerario) && fecha1 < fecha2)
                {
                    this.saveRecord();
                }
                else
                {
                    window.alert("Las fechas de la visita deben estar dentro del intervalo de tiempo del itinerario seleccionado");
                }
            };
            
            ciudadService.fetchRecords().then(function(data){
                $scope.ciudadRecords = data;
            });
            
            this.getCiudadName = function(id){
                for (var i in $scope.ciudadRecords) {
                    if ($scope.ciudadRecords[i].id === id) {
                        return $scope.ciudadRecords[i].name;
                    }
                }
                return;
            };
            
            itinerarioService.fetchRecords().then(function(data){
                $scope.itinerarioRecords = data;
            });
            
            this.getItinerarioName = function(id){
                for (var i in $scope.itinerarioRecords) {
                    if ($scope.itinerarioRecords[i].id === id) {
                        return $scope.itinerarioRecords[i].name;
                    }
                }
                return;
            };
            
            this.getItinerarioInicio = function(id){
                for (var i in $scope.itinerarioRecords) {
                    if ($scope.itinerarioRecords[i].id === id) {
                        return $scope.itinerarioRecords[i].inicio;
                    }
                }
                return;
            };
            
            this.getItinerarioFin = function(id){
                for (var i in $scope.itinerarioRecords) {
                    if ($scope.itinerarioRecords[i].id === id) {
                        return $scope.itinerarioRecords[i].fin;
                    }
                }
                return;
            };
        }]);
})(window.angular);
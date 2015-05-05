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
            
            ciudadService.fetchRecords().then(function(data){
                $scope.ciudadRecords = data;
            });
            
            this.getCiudadName = function(id){
                for (var i in $scope.ciudadRecords) {
                    if ($scope.ciudadRecords[i].id === id) {
                        return $scope.ciudadRecords[i].nombre;
                    }
                }
                return;
            };
            
            itinerarioService.fetchRecords().then(function(data){
                $scope.itinerarioRecords = data;
            });
            
            this.getItinerarioName = function(id){
                for (var i in $scope.itinerarioRecords) {
                    if ($scope.Records[i].id === id) {
                        return $scope.itinerarioRecords[i].nombre;
                    }
                }
                return;
            };
        }]);
})(window.angular);
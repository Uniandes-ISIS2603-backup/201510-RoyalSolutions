(function () {
    var itinerarioModule = angular.module('itinerarioModule');

    itinerarioModule.controller('itinerarioCtrl', ['$scope', 'itinerarioService', function ($scope, itinerarioService) {
            itinerarioService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
            this.formatearFecha = function(date) {
               var fechaStr = date.toString();
               fechaStr = fechaStr.split("T",1);
               return fechaStr[0];
            };
        }]);
})();
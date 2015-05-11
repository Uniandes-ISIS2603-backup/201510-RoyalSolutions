(function (angular) {
    var eventoModule = angular.module('eventoModule');

    eventoModule.controller('eventoCtrl', ['$scope', 'eventoService','ciudadService', function ($scope, eventoService, ciudadService) {
            eventoService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
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
        }]);
})(window.angular);
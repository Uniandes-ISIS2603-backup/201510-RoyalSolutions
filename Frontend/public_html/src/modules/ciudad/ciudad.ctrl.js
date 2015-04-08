(function () {
    var ciudadModule = angular.module('ciudadModule');

    ciudadModule.controller('ciudadCtrl', ['$scope', 'ciudadService','paisService', function ($scope, ciudadService, paisService) {
            ciudadService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
            paisService.fetchRecords().then(function(data){
                $scope.paisRecords = data;
            });
            
            this.getPaisName = function(id){
                for (var i in $scope.paisRecords) {
                    if ($scope.paisRecords[i].id === id) {
                        return $scope.paisRecords[i].nombre;
                    }
                }
                return;
            };
            
            this.getMostPopulated = function () {
                ciudadService.getMostPopulated().then(function(data){
                    alert('The most populated ciudad is ' + data.name + ' with ' + data.population + ' habitants');
                }, function(){
                    alert('There are no countries with population on server');
                });
            };

            this.getLeastPopulated = function () {
                ciudadService.getLeastPopulated().then(function (data) {
                    alert('The least populated ciudad is ' + data.name + ' with ' + data.population + ' habitants');
                }, function(){
                    alert('There are no countries with population on server');
                });
            };
        }]);
})();
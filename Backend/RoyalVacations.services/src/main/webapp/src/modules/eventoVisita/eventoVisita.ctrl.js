(function (angular) {
    var eventoVisitaModule = angular.module('eventoVisitaModule');

    eventoVisitaModule.controller('eventoVisitaCtrl', ['$scope','$rootScope','eventoVisitaService','eventoService', 'visitaService',function ($scope, $rootScope, eventoVisitaService, eventoService, visitaService) {
            eventoVisitaService.extendCtrl(this, $scope);
            
            this.fetchRecords();
            
            eventoService.fetchRecords().then(function(data){
                $scope.eventoRecords = data;
            });
            
            this.geteventoName = function(id){
                for (var i in $scope.eventoRecords) {
                    if ($scope.eventoRecords[i].id === id) {
                        return $scope.eventoRecords[i].name;
                    }
                }
                return;
            };
            
            this.geteventoDate = function(id){
                for (var i in $scope.eventoRecords) {
                    if ($scope.eventoRecords[i].id === id) {
                        return $scope.eventoRecords[i].fecha;
                    }
                }
                return;
            };
            
            this.geteventoCiudad = function(id){
                for (var i in $scope.eventoRecords) {
                    if ($scope.eventoRecords[i].id === id) {
                        return $scope.eventoRecords[i].ciudad;
                    }
                }
                return;
            };
            
            this.guardar = function(idvisita, idevento) {
                //if(this.geteventoDate(idevento) < this.getvisitaInicio(idvisita) || this.geteventoDate(idevento) > this.getvisitaFin(idvisita))
                //{
                    //window.alert("La fecha del evento no coincide con la visita");
                //}
                //else if(this.geteventoCiudad(idevento) !== this.getvisitaCiudad(idvisita))
                //{
                    //window.alert("La ciudad del evento no coincide con la ciudad de la visita");
                //}
                //else
                //{
                    $scope.currentRecord.visita = $rootScope.idVisitaActual;
                    this.saveRecord();
                //}
            };
            
            visitaService.fetchRecords().then(function(data){
                $scope.visitaRecords = data;
            });
            
            this.getvisitaName = function(id){
                for (var i in $scope.visitaRecords) {
                    if ($scope.visitaRecords[i].id === id) {
                        return $scope.visitaRecords[i].name;
                    }
                }
                return;
            };
            
            this.getvisitaInicio = function(id){
                for (var i in $scope.visitaRecords) {
                    if ($scope.visitaRecords[i].id === id) {
                        return $scope.visitaRecords[i].inicio;
                    }
                }
                return;
            };
            
            this.getvisitaFin = function(id){
                for (var i in $scope.visitaRecords) {
                    if ($scope.visitaRecords[i].id === id) {
                        return $scope.visitaRecords[i].fin;
                    }
                }
                return;
            };
            
            this.getvisitaCiudad = function(id){
                for (var i in $scope.visitaRecords) {
                    if ($scope.visitaRecords[i].id === id) {
                        return $scope.visitaRecords[i].ciudad;
                    }
                }
                return;
            };
            
            this.darIdVisita = function() {
                return $rootScope.idVisitaActual;
            };
            
            
        }]);
})(window.angular);
(function(angular){
    var eventoVisitaModule = angular.module('eventoVisitaModule');
    
    eventoVisitaModule.service('eventoVisitaService', ['CRUDBase','eventoVisita.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})(window.angular);
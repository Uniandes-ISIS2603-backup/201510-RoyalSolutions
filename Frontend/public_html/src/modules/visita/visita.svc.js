(function(){
    var visitaModule = angular.module('visitaModule');
    
    visitaModule.service('visitaService', ['CRUDBase','visita.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();

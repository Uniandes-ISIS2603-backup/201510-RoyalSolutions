(function(){
    var itinerarioModule = angular.module('itinerarioModule');
    
    itinerarioModule.service('itinerarioService', ['CRUDBase','itinerario.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();

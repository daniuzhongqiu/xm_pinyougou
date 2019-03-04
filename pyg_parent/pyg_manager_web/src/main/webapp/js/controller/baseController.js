app.controller('baseController', function ($scope) {

    //重新加载列表 数据
    $scope.reloadList=function(){
        //切换页码
        $scope.search( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    }

    $scope.paginationConf = {
        currentPage:1,  				//当前页
        totalItems:10,					//总记录数
        itemsPerPage:10,				//每页记录数
        perPageOptions:[10,20,30,40], //分页选项，下拉选择一页多少条记录
        onChange:function(){			//页面变更后触发的方法
            $scope.reloadList();		//启动就会调用分页组件
        }
    }

    $scope.selectIds = [];

    $scope.updateSelect = function ($event, id) {
        if ($event.target.checked) {
            $scope.selectIds.push(id);
        }else {
            $scope.selectIds.splice($scope.selectIds.indexOf(id), 1);
        }
    }
})
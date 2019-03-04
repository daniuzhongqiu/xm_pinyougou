app.controller('specificationController', function ($scope, $controller, specificationService) {

    $controller('baseController', {$scope:$scope});

    //查询商品
    /*$scope.findAll = function () {
        //alert(123)
        specificationService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        )
    }*/


    //分页显示
    $scope.findPage = function () {
        specificationService.findPage($scope.paginationConf.itemsPerPage, $scope.paginationConf.currentPage).success(
            function (response) {
                alert(response.rows)
                alert(response.total)
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;
            }
        )
    }

    //数据回显
    $scope.findOne = function (id) {
        specificationService.findOne(id).success (
            function (response) {
                $scope.entity = response;
            })
    }

    //保存（包含新增和修改的一部分）
    $scope.save = function () {
        if ($scope.entity.specification.id == null) {
            alert(23)
            specificationService.add($scope.entity).success(
                function (response) {
                    //alert(123456)
                    if(response.success){
                        $scope.findPage();
                    }else {
                        alert(response.message)
                    }
                }
            )
        }else{
            alert(12)
            specificationService.update($scope.entity).success(
                function (response) {
                    if (response.success) {
                        $scope.findPage();
                    }else {
                        alert(response.message)
                    }
                }
            )
        }
    }


    //删除批量删除
    $scope.del = function () {
        specificationService.delete($scope.selectIds).success (
            function (response) {
                if (response.success) {
                    $scope.findPage();
                }else {
                    alert(response.message);
                }
            }
        )
    }

    $scope.xiao = function (id) {
        if ($scope.selectIds.indexOf(id) == -1) {
            return false;
        }
        return true;
    }
    $scope.searchEntity = {};

    //模糊查询
    $scope.search = function () {
        alert(123);
        specificationService.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage, $scope.searchEntity).success(
            function(response) {
                //alert(response.rows);
                //alert(response.total);
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;
            }
        )
    }

   $scope.init = function () {
       $scope.entity = {specificationOptions:[]};
   }
    //$scope.entity = {specificationOptions:[]}; 页面已加载就开始初始化了，当点击查询的时候，entity就是空值了。

   $scope.addRow = function () {
       $scope.entity.specificationOptions.push({});
   }

   $scope.delRow = function ($index) {
       $scope.entity.specificationOptions.splice($index, 1);
   }
})
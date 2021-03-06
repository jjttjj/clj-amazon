(ns clj-amazon.fixture.item-search)

(def response
  {:tag :ItemSearchResponse,
   :attrs {:xmlns "http://webservices.amazon.com/AWSECommerceService/2013-08-01"},
   :content
   [{:tag :OperationRequest,
     :attrs nil,
     :content
     [{:tag :HTTPHeaders,
       :attrs nil,
       :content
       [{:tag :Header, :attrs {:Value "Apache-HttpClient/4.5 (Java/1.8.0_40)", :Name "UserAgent"}, :content nil}]}
      {:tag :RequestId, :attrs nil, :content ["7596911a-595c-49af-9638-f232d4708cdb"]}
      {:tag :Arguments,
       :attrs nil,
       :content
       [{:tag :Argument, :attrs {:Value "dummy-access-key", :Name "AWSAccessKeyId"}, :content nil}
        {:tag :Argument, :attrs {:Value "dummy-associate-tag", :Name "AssociateTag"}, :content nil}
        {:tag :Argument, :attrs {:Value "False", :Name "IncludeReviewsSummary"}, :content nil}
        {:tag :Argument, :attrs {:Value "20", :Name "MaximumPrice"}, :content nil}
        {:tag :Argument, :attrs {:Value "5", :Name "MinimumPrice"}, :content nil}
        {:tag :Argument, :attrs {:Value "ItemSearch", :Name "Operation"}, :content nil}
        {:tag :Argument, :attrs {:Value "ItemAttributes", :Name "ResponseGroup"}, :content nil}
        {:tag :Argument, :attrs {:Value "Books", :Name "SearchIndex"}, :content nil}
        {:tag :Argument, :attrs {:Value "AWSECommerceService", :Name "Service"}, :content nil}
        {:tag :Argument, :attrs {:Value "2015-10-29T21:38:23.000Z", :Name "Timestamp"}, :content nil}
        {:tag :Argument, :attrs {:Value "ドラゴンボール", :Name "Title"}, :content nil}
        {:tag :Argument, :attrs {:Value "2013-08-01", :Name "Version"}, :content nil}
        {:tag :Argument,
         :attrs {:Value "a3h5zXr+dl6DCvWomck+jl2UI9bnc22Y/fZtFgLe+T8=", :Name "Signature"},
         :content nil}]}
      {:tag :RequestProcessingTime, :attrs nil, :content ["0.0221271520000000"]}]}
    {:tag :Items,
     :attrs nil,
     :content
     [{:tag :Request,
       :attrs nil,
       :content
       [{:tag :IsValid, :attrs nil, :content ["True"]}
        {:tag :ItemSearchRequest,
         :attrs nil,
         :content
         [{:tag :MaximumPrice, :attrs nil, :content ["20"]}
          {:tag :MinimumPrice, :attrs nil, :content ["5"]}
          {:tag :ResponseGroup, :attrs nil, :content ["ItemAttributes"]}
          {:tag :SearchIndex, :attrs nil, :content ["Books"]}
          {:tag :Title, :attrs nil, :content ["ドラゴンボール"]}
          {:tag :IncludeReviewsSummary, :attrs nil, :content ["False"]}]}]}
      {:tag :TotalResults, :attrs nil, :content ["2"]}
      {:tag :TotalPages, :attrs nil, :content ["1"]}
      {:tag :MoreSearchResultsUrl,
       :attrs nil,
       :content
       ["http://www.amazon.co.jp/gp/redirect.html?linkCode=xm2&SubscriptionId=dummy-access-key&location=http%3A%2F%2Fwww.amazon.co.jp%2Fgp%2Fsearch%3Fkeywords%3D%25E3%2583%2589%25E3%2583%25A9%25E3%2582%25B4%25E3%2583%25B3%25E3%2583%259C%25E3%2583%25BC%25E3%2583%25AB%26url%3Dsearch-alias%253Dbooks-single-index&tag=dummy-associate-tag&creative=5143&camp=2025"]}
      {:tag :Item,
       :attrs nil,
       :content
       [{:tag :ASIN, :attrs nil, :content ["4088748093"]}
        {:tag :DetailPageURL,
         :attrs nil,
         :content
         ["http://www.amazon.co.jp/%E3%83%89%E3%83%A9%E3%82%B4%E3%83%B3%E3%83%9C%E3%83%BC%E3%83%ABZ%E9%AD%94%E4%BA%BA%E3%83%96%E3%82%A6%E5%BE%A9%E6%B4%BB%E7%B7%A8-%E5%B7%BB2%E2%80%95TV%E7%89%88%E3%82%A2%E3%83%8B%E3%83%A1%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%82%B9-%E3%82%B8%E3%83%A3%E3%83%B3%E3%83%97%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%82%B9-%E9%B3%A5%E5%B1%B1-%E6%98%8E/dp/4088748093%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D4088748093"]}
        {:tag :ItemLinks,
         :attrs nil,
         :content
         [{:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["Add To Wishlist"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/registry/wishlist/add-item.html%3Fasin.0%3D4088748093%26SubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088748093"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["Tell A Friend"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/pdp/taf/4088748093%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088748093"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Customer Reviews"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/review/product/4088748093%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088748093"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Offers"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/offer-listing/4088748093%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088748093"]}]}]}
        {:tag :ItemAttributes,
         :attrs nil,
         :content
         [{:tag :Author, :attrs nil, :content ["鳥山 明"]}
          {:tag :Binding, :attrs nil, :content ["コミック"]}
          {:tag :Creator, :attrs {:Role "編さん"}, :content ["ジャンプ・コミック出版編集部"]}
          {:tag :EAN, :attrs nil, :content ["9784088748092"]}
          {:tag :EANList, :attrs nil, :content [{:tag :EANListElement, :attrs nil, :content ["9784088748092"]}]}
          {:tag :ISBN, :attrs nil, :content ["4088748093"]}
          {:tag :Label, :attrs nil, :content ["集英社"]}
          {:tag :ListPrice,
           :attrs nil,
           :content
           [{:tag :Amount, :attrs nil, :content ["751"]}
            {:tag :CurrencyCode, :attrs nil, :content ["JPY"]}
            {:tag :FormattedPrice, :attrs nil, :content ["￥ 751"]}]}
          {:tag :Manufacturer, :attrs nil, :content ["集英社"]}
          {:tag :NumberOfPages, :attrs nil, :content ["176"]}
          {:tag :PackageDimensions,
           :attrs nil,
           :content
           [{:tag :Height, :attrs {:Units "hundredths-inches"}, :content ["55"]}
            {:tag :Length, :attrs {:Units "hundredths-inches"}, :content ["693"]}
            {:tag :Weight, :attrs {:Units "hundredths-pounds"}, :content ["49"]}
            {:tag :Width, :attrs {:Units "hundredths-inches"}, :content ["449"]}]}
          {:tag :ProductGroup, :attrs nil, :content ["Book"]}
          {:tag :ProductTypeName, :attrs nil, :content ["ABIS_BOOK"]}
          {:tag :PublicationDate, :attrs nil, :content ["2009-08-04"]}
          {:tag :Publisher, :attrs nil, :content ["集英社"]}
          {:tag :Studio, :attrs nil, :content ["集英社"]}
          {:tag :Title, :attrs nil, :content ["ドラゴンボールZ魔人ブウ復活編 巻2―TV版アニメコミックス (ジャンプコミックス)"]}]}]}
      {:tag :Item,
       :attrs nil,
       :content
       [{:tag :ASIN, :attrs nil, :content ["B00CG2QKC2"]}
        {:tag :DetailPageURL,
         :attrs nil,
         :content
         ["http://www.amazon.co.jp/%EF%BC%B6%E3%82%B8%E3%83%A3%E3%83%B3%E3%83%97%E3%83%96%E3%83%83%E3%82%AF%E3%82%B9-%E3%82%B2%E3%83%BC%E3%83%A0%E3%82%B7%E3%83%AA%E3%83%BC%E3%82%BA-%E3%83%89%E3%83%A9%E3%82%B4%E3%83%B3%E3%83%9C%E3%83%BC%E3%83%AB%EF%BC%BA%E8%B6%85%E6%AD%A6%E5%8B%87%E4%BC%9D%EF%BC%92-%E9%9B%86%E8%8B%B1%E7%A4%BE/dp/B00CG2QKC2%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3DB00CG2QKC2"]}
        {:tag :ItemLinks,
         :attrs nil,
         :content
         [{:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["Add To Wishlist"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/registry/wishlist/add-item.html%3Fasin.0%3DB00CG2QKC2%26SubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB00CG2QKC2"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["Tell A Friend"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/pdp/taf/B00CG2QKC2%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB00CG2QKC2"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Customer Reviews"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/review/product/B00CG2QKC2%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB00CG2QKC2"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Offers"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/offer-listing/B00CG2QKC2%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB00CG2QKC2"]}]}]}
        {:tag :ItemAttributes,
         :attrs nil,
         :content
         [{:tag :Binding, :attrs nil, :content ["雑誌"]}
          {:tag :Creator, :attrs {:Role "編集"}, :content ["集英社"]}
          {:tag :EAN, :attrs nil, :content ["1067301061009"]}
          {:tag :EANList, :attrs nil, :content [{:tag :EANListElement, :attrs nil, :content ["1067301061009"]}]}
          {:tag :Languages,
           :attrs nil,
           :content
           [{:tag :Language,
             :attrs nil,
             :content [{:tag :Name, :attrs nil, :content ["日本語"]} {:tag :Type, :attrs nil, :content ["Unknown"]}]}]}
          {:tag :ListPrice,
           :attrs nil,
           :content
           [{:tag :Amount, :attrs nil, :content ["1000"]}
            {:tag :CurrencyCode, :attrs nil, :content ["JPY"]}
            {:tag :FormattedPrice, :attrs nil, :content ["￥ 1,000"]}]}
          {:tag :PackageDimensions,
           :attrs nil,
           :content
           [{:tag :Height, :attrs {:Units "hundredths-inches"}, :content ["47"]}
            {:tag :Length, :attrs {:Units "hundredths-inches"}, :content ["803"]}
            {:tag :Weight, :attrs {:Units "hundredths-pounds"}, :content ["49"]}
            {:tag :Width, :attrs {:Units "hundredths-inches"}, :content ["575"]}]}
          {:tag :ProductGroup, :attrs nil, :content ["Book"]}
          {:tag :ProductTypeName, :attrs nil, :content ["BOOKS_1973_AND_LATER"]}
          {:tag :PublicationDate, :attrs nil, :content ["1993"]}
          {:tag :Title, :attrs nil, :content ["Ｖジャンプブックス[ゲームシリーズ]ドラゴンボールＺ超武勇伝２"]}]}]}]}]})

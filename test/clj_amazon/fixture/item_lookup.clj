(ns clj-amazon.fixture.item-lookup)

(def response
  {:tag :ItemLookupResponse,
   :attrs {:xmlns "http://webservices.amazon.com/AWSECommerceService/2013-08-01"},
   :content
   [{:tag :OperationRequest,
     :attrs nil,
     :content
     [{:tag :HTTPHeaders,
       :attrs nil,
       :content
       [{:tag :Header, :attrs {:Value "Apache-HttpClient/4.5 (Java/1.8.0_40)", :Name "UserAgent"}, :content nil}]}
      {:tag :RequestId, :attrs nil, :content ["6a94ecf7-a91b-42a4-a630-28c8720eee2d"]}
      {:tag :Arguments,
       :attrs nil,
       :content
       [{:tag :Argument, :attrs {:Value "dummy-access-key", :Name "AWSAccessKeyId"}, :content nil}
        {:tag :Argument, :attrs {:Value "dummy-associate-tag", :Name "AssociateTag"}, :content nil}
        {:tag :Argument, :attrs {:Value "ASIN", :Name "IdType"}, :content nil}
        {:tag :Argument, :attrs {:Value "False", :Name "IncludeReviewsSummary"}, :content nil}
        {:tag :Argument, :attrs {:Value "4088518314,B009GZK2YE", :Name "ItemId"}, :content nil}
        {:tag :Argument, :attrs {:Value "ItemLookup", :Name "Operation"}, :content nil}
        {:tag :Argument, :attrs {:Value "ItemAttributes", :Name "ResponseGroup"}, :content nil}
        {:tag :Argument, :attrs {:Value "AWSECommerceService", :Name "Service"}, :content nil}
        {:tag :Argument, :attrs {:Value "2015-10-29T21:13:24.000Z", :Name "Timestamp"}, :content nil}
        {:tag :Argument, :attrs {:Value "2013-08-01", :Name "Version"}, :content nil}
        {:tag :Argument,
         :attrs {:Value "OprIXZtnTnBmRK7QcwSEEagICNOC5VJk1/lLcG+F//Q=", :Name "Signature"},
         :content nil}]}
      {:tag :RequestProcessingTime, :attrs nil, :content ["0.0121677320000000"]}]}
    {:tag :Items,
     :attrs nil,
     :content
     [{:tag :Request,
       :attrs nil,
       :content
       [{:tag :IsValid, :attrs nil, :content ["True"]}
        {:tag :ItemLookupRequest,
         :attrs nil,
         :content
         [{:tag :IdType, :attrs nil, :content ["ASIN"]}
          {:tag :ItemId, :attrs nil, :content ["4088518314"]}
          {:tag :ItemId, :attrs nil, :content ["B009GZK2YE"]}
          {:tag :ResponseGroup, :attrs nil, :content ["ItemAttributes"]}
          {:tag :VariationPage, :attrs nil, :content ["All"]}
          {:tag :IncludeReviewsSummary, :attrs nil, :content ["False"]}]}]}
      {:tag :Item,
       :attrs nil,
       :content
       [{:tag :ASIN, :attrs nil, :content ["4088518314"]}
        {:tag :DetailPageURL,
         :attrs nil,
         :content
         ["http://www.amazon.co.jp/%E3%83%89%E3%83%A9%E3%82%B4%E3%83%B3%E3%83%9C%E3%83%BC%E3%83%AB-%E5%B7%BB1-%E3%82%B8%E3%83%A3%E3%83%B3%E3%83%97%E3%83%BB%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%82%B9-%E9%B3%A5%E5%B1%B1-%E6%98%8E/dp/4088518314%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D4088518314"]}
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
             ["http://www.amazon.co.jp/gp/registry/wishlist/add-item.html%3Fasin.0%3D4088518314%26SubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088518314"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["Tell A Friend"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/pdp/taf/4088518314%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088518314"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Customer Reviews"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/review/product/4088518314%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088518314"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Offers"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/offer-listing/4088518314%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3D4088518314"]}]}]}
        {:tag :ItemAttributes,
         :attrs nil,
         :content
         [{:tag :Author, :attrs nil, :content ["鳥山 明"]}
          {:tag :Binding, :attrs nil, :content ["コミック"]}
          {:tag :EAN, :attrs nil, :content ["9784088518312"]}
          {:tag :EANList, :attrs nil, :content [{:tag :EANListElement, :attrs nil, :content ["9784088518312"]}]}
          {:tag :ISBN, :attrs nil, :content ["4088518314"]}
          {:tag :ItemDimensions,
           :attrs nil,
           :content
           [{:tag :Height, :attrs {:Units "hundredths-inches"}, :content ["453"]}
            {:tag :Length, :attrs {:Units "hundredths-inches"}, :content ["689"]}
            {:tag :Width, :attrs {:Units "hundredths-inches"}, :content ["55"]}]}
          {:tag :Label, :attrs nil, :content ["集英社"]}
          {:tag :Languages,
           :attrs nil,
           :content
           [{:tag :Language,
             :attrs nil,
             :content [{:tag :Name, :attrs nil, :content ["日本語"]} {:tag :Type, :attrs nil, :content ["Published"]}]}
            {:tag :Language,
             :attrs nil,
             :content
             [{:tag :Name, :attrs nil, :content ["日本語"]} {:tag :Type, :attrs nil, :content ["Original Language"]}]}
            {:tag :Language,
             :attrs nil,
             :content [{:tag :Name, :attrs nil, :content ["日本語"]} {:tag :Type, :attrs nil, :content ["Unknown"]}]}]}
          {:tag :ListPrice,
           :attrs nil,
           :content
           [{:tag :Amount, :attrs nil, :content ["432"]}
            {:tag :CurrencyCode, :attrs nil, :content ["JPY"]}
            {:tag :FormattedPrice, :attrs nil, :content ["￥ 432"]}]}
          {:tag :Manufacturer, :attrs nil, :content ["集英社"]}
          {:tag :NumberOfPages, :attrs nil, :content ["175"]}
          {:tag :PackageDimensions,
           :attrs nil,
           :content
           [{:tag :Height, :attrs {:Units "hundredths-inches"}, :content ["55"]}
            {:tag :Length, :attrs {:Units "hundredths-inches"}, :content ["677"]}
            {:tag :Weight, :attrs {:Units "hundredths-pounds"}, :content ["31"]}
            {:tag :Width, :attrs {:Units "hundredths-inches"}, :content ["441"]}]}
          {:tag :ProductGroup, :attrs nil, :content ["Book"]}
          {:tag :ProductTypeName, :attrs nil, :content ["ABIS_BOOK"]}
          {:tag :PublicationDate, :attrs nil, :content ["1985-09"]}
          {:tag :Publisher, :attrs nil, :content ["集英社"]}
          {:tag :Studio, :attrs nil, :content ["集英社"]}
          {:tag :Title, :attrs nil, :content ["ドラゴンボール (巻1) (ジャンプ・コミックス)"]}]}]}
      {:tag :Item,
       :attrs nil,
       :content
       [{:tag :ASIN, :attrs nil, :content ["B009GZK2YE"]}
        {:tag :DetailPageURL,
         :attrs nil,
         :content
         ["http://www.amazon.co.jp/ONE-PIECE-%E3%83%A2%E3%83%8E%E3%82%AF%E3%83%AD%E7%89%88-1-%E3%82%B8%E3%83%A3%E3%83%B3%E3%83%97%E3%82%B3%E3%83%9F%E3%83%83%E3%82%AF%E3%82%B9DIGITAL-ebook/dp/B009GZK2YE%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3DB009GZK2YE"]}
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
             ["http://www.amazon.co.jp/gp/registry/wishlist/add-item.html%3Fasin.0%3DB009GZK2YE%26SubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB009GZK2YE"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["Tell A Friend"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/pdp/taf/B009GZK2YE%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB009GZK2YE"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Customer Reviews"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/review/product/B009GZK2YE%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB009GZK2YE"]}]}
          {:tag :ItemLink,
           :attrs nil,
           :content
           [{:tag :Description, :attrs nil, :content ["All Offers"]}
            {:tag :URL,
             :attrs nil,
             :content
             ["http://www.amazon.co.jp/gp/offer-listing/B009GZK2YE%3FSubscriptionId%3Ddummy-access-key%26tag%3Ddummy-associate-tag%26linkCode%3Dxm2%26camp%3D2025%26creative%3D5143%26creativeASIN%3DB009GZK2YE"]}]}]}
        {:tag :ItemAttributes,
         :attrs nil,
         :content
         [{:tag :Author, :attrs nil, :content ["尾田 栄一郎"]}
          {:tag :Binding, :attrs nil, :content ["Kindle版"]}
          {:tag :Format, :attrs nil, :content ["Kindle本"]}
          {:tag :IsAdultProduct, :attrs nil, :content ["0"]}
          {:tag :Label, :attrs nil, :content ["集英社"]}
          {:tag :Languages,
           :attrs nil,
           :content
           [{:tag :Language,
             :attrs nil,
             :content [{:tag :Name, :attrs nil, :content ["日本語"]} {:tag :Type, :attrs nil, :content ["Published"]}]}]}
          {:tag :Manufacturer, :attrs nil, :content ["集英社"]}
          {:tag :NumberOfPages, :attrs nil, :content ["208"]}
          {:tag :ProductGroup, :attrs nil, :content ["eBooks"]}
          {:tag :ProductTypeName, :attrs nil, :content ["ABIS_EBOOKS"]}
          {:tag :PublicationDate, :attrs nil, :content ["1997-12-24"]}
          {:tag :Publisher, :attrs nil, :content ["集英社"]}
          {:tag :ReleaseDate, :attrs nil, :content ["2012-09-21"]}
          {:tag :Studio, :attrs nil, :content ["集英社"]}
          {:tag :Title, :attrs nil, :content ["ONE PIECE モノクロ版 1 (ジャンプコミックスDIGITAL)"]}]}]}]}]})
